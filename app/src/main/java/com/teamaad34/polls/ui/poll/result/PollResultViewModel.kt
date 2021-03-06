package com.teamaad34.polls.ui.poll.result

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.teamaad34.polls.data.repository.choice.IChoicesRepository
import com.teamaad34.polls.data.repository.question.IQuestionsRepository

class PollResultViewModel @ViewModelInject constructor(
    private val questionsRepository: IQuestionsRepository,
    private val choicesRepository: IChoicesRepository
) : ViewModel() {
    // TODO: Implement the ViewModel
}