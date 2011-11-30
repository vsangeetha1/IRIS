package com.temenos.ebank.common.wicket.formValidation;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.feedback.FeedbackMessage;
import org.apache.wicket.feedback.FeedbackMessagesModel;
import org.apache.wicket.feedback.IFeedback;
import org.apache.wicket.feedback.IFeedbackMessageFilter;
import org.apache.wicket.markup.html.WebMarkupContainer;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.IModel;

public class FieldsWithErrorslFeedbackPanel extends Panel implements IFeedback {

	/**
	 * A panel that displays the name of the fields in error in a list view. The
	 * maximum number of messages to show can be set with setMaxMessages().
	 * 
	 * @see org.apache.wicket.feedback.FeedbackMessage
	 * @see org.apache.wicket.feedback.FeedbackMessages
	 * @author Jonathan Locke
	 * @author Eelco Hillenius
	 */
	/**
	 * List for messages.
	 */
	private final class MessageListView extends ListView<FeedbackMessage> {
		private static final long serialVersionUID = 1L;

		/**
		 * @see org.apache.wicket.Component#Component(String)
		 */
		public MessageListView(final String id) {
			super(id);
			setDefaultModel(newFeedbackMessagesModel());
		}

		/**
		 * @see org.apache.wicket.markup.html.list.ListView#populateItem(org.apache.wicket.markup.html .list.ListItem)
		 */
		@Override
		protected void populateItem(final ListItem<FeedbackMessage> listItem) {
			final FeedbackMessage message = listItem.getModelObject();
			// message.markRendered();
			/*final IModel<String> replacementModel = new Model<String>() {
				private static final long serialVersionUID = 1L;

				*//**
				 * Returns FieldsWithErrorslFeedbackPanel + the message level, eg 'feedbackPanelERROR'. This is used
				 * as the class of the li / span elements.
				 * 
				 * @see org.apache.wicket.model.IModel#getObject()
				 *//*
				@Override
				public String getObject() {
					return getCSSClass(message);
				}
			};*/

			final Component label = newMessageDisplayComponent("message", message);
			//final AttributeModifier levelModifier = new AttributeModifier("class", replacementModel);
			//label.add(levelModifier);
			//listItem.add(levelModifier);
			listItem.add(label);
		}
	}

	private static final long serialVersionUID = 1L;

	/** Message view */
	private final MessageListView messageListView;

	/**
	 * @see org.apache.wicket.Component#Component(String)
	 */
	public FieldsWithErrorslFeedbackPanel(final String id) {
		this(id, null);
	}

	@Override
	public boolean isVisible() {
		return anyErrorMessage();
	}

	/**
	 * @see org.apache.wicket.Component#Component(String)
	 * 
	 * @param id
	 * @param filter
	 */
	public FieldsWithErrorslFeedbackPanel(final String id, IFeedbackMessageFilter filter) {
		super(id);
		WebMarkupContainer messagesContainer = new WebMarkupContainer("feedbackul") {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isVisible() {
				return anyMessage();
			}
		};
		add(messagesContainer);
		messageListView = new MessageListView("messages");
		messageListView.setVersioned(false);
		messagesContainer.add(messageListView);

		if (filter != null) {
			setFilter(filter);
		}
	}

	/**
	 * Search messages that this panel will render, and see if there is any message of level ERROR
	 * or up. This is a convenience method; same as calling 'anyMessage(FeedbackMessage.ERROR)'.
	 * 
	 * @return whether there is any message for this panel of level ERROR or up
	 */
	public final boolean anyErrorMessage() {
		return anyMessage(FeedbackMessage.ERROR);
	}

	/**
	 * Search messages that this panel will render, and see if there is any message.
	 * 
	 * @return whether there is any message for this panel
	 */
	public final boolean anyMessage() {
		return anyMessage(FeedbackMessage.UNDEFINED);
	}

	/**
	 * Search messages that this panel will render, and see if there is any message of the given
	 * level.
	 * 
	 * @param level
	 *            the level, see FeedbackMessage
	 * @return whether there is any message for this panel of the given level
	 */
	public final boolean anyMessage(int level) {
		List<FeedbackMessage> msgs = getCurrentMessages();

		for (FeedbackMessage msg : msgs) {
			if (msg.isLevel(level)) {
				return true;
			}
		}

		return false;
	}

	/**
	 * @return Model for feedback messages on which you can install filters and other properties
	 */
	public final FeedbackMessagesModel getFeedbackMessagesModel() {
		return (FeedbackMessagesModel) messageListView.getDefaultModel();
	}

	/**
	 * @return The current message filter
	 */
	public final IFeedbackMessageFilter getFilter() {
		return getFeedbackMessagesModel().getFilter();
	}

	/**
	 * @return The current sorting comparator
	 */
	public final Comparator<FeedbackMessage> getSortingComparator() {
		return getFeedbackMessagesModel().getSortingComparator();
	}

	/**
	 * @see org.apache.wicket.Component#isVersioned()
	 */
	@Override
	public boolean isVersioned() {
		return false;
	}

	/**
	 * Sets a filter to use on the feedback messages model
	 * 
	 * @param filter
	 *            The message filter to install on the feedback messages model
	 * 
	 * @return FieldsWithErrorslFeedbackPanel this.
	 */
	public final FieldsWithErrorslFeedbackPanel setFilter(IFeedbackMessageFilter filter) {
		getFeedbackMessagesModel().setFilter(filter);
		return this;
	}

	/**
	 * @param maxMessages
	 *            The maximum number of feedback messages that this feedback panel should show at
	 *            one time
	 * 
	 * @return FieldsWithErrorslFeedbackPanel this.
	 */
	public final FieldsWithErrorslFeedbackPanel setMaxMessages(int maxMessages) {
		messageListView.setViewSize(maxMessages);
		return this;
	}

	/**
	 * Sets the comparator used for sorting the messages.
	 * 
	 * @param sortingComparator
	 *            comparator used for sorting the messages.
	 * 
	 * @return FieldsWithErrorslFeedbackPanel this.
	 */
	public final FieldsWithErrorslFeedbackPanel setSortingComparator(Comparator<FeedbackMessage> sortingComparator) {
		getFeedbackMessagesModel().setSortingComparator(sortingComparator);
		return this;
	}

	/**
	 * Gets the css class for the given message.
	 * 
	 * @param message
	 *            the message
	 * @return the css class; by default, this returns feedbackPanel + the message level, eg
	 *         'feedbackPanelERROR', but you can override this method to provide your own
	 */
	protected String getCSSClass(final FeedbackMessage message) {
		return "feedbackPanel" + message.getLevelAsString();
	}

	/**
	 * Gets the currently collected messages for this panel.
	 * 
	 * @return the currently collected messages for this panel, possibly empty
	 */
	protected final List<FeedbackMessage> getCurrentMessages() {
		final List<FeedbackMessage> messages = messageListView.getModelObject();
		return Collections.unmodifiableList(messages);
	}

	/**
	 * Gets a new instance of FeedbackMessagesModel to use.
	 * 
	 * @return Instance of FeedbackMessagesModel to use
	 */
	protected FeedbackMessagesModel newFeedbackMessagesModel() {
		return new FeedbackMessagesModel(this);
	}

	/**
	 * Generates a component that is used to display the message inside the feedback panel. This
	 * component must handle being attached to <code>span</code> tags.
	 * 
	 * By default a {@link Label} is used.
	 * 
	 * Note that the created component is expected to respect feedback panel's {@link #getEscapeModelStrings()} value
	 * 
	 * @param id
	 *            parent id
	 * @param message
	 *            feedback message
	 * @return component used to display the message
	 */
	protected Component newMessageDisplayComponent(String id, FeedbackMessage message) {
		Serializable serializable = null;
		if (message.getReporter() instanceof FormComponent) {
			FormComponent fc = (FormComponent) message.getReporter();
			IModel<String> labelModel = fc.getLabel();
			if (labelModel != null) {
				serializable = labelModel.getObject();
			} else {
				// default to imput's name
				serializable = fc.getInputName();
			}
		} else {
			// unlikely to happen - provide the id of the field in this case
			serializable = message.getReporter().getId();
		}
		Label label = new Label(id, (serializable == null) ? "" : serializable.toString());
		label.setEscapeModelStrings(FieldsWithErrorslFeedbackPanel.this.getEscapeModelStrings());
		return label;
	}
}
