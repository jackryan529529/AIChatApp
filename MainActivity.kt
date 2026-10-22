package com.example.aichat

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputBox: EditText
    private lateinit var sendButton: Button
    private lateinit var chatWindow: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputBox = findViewById(R.id.inputBox)
        sendButton = findViewById(R.id.sendButton)
        chatWindow = findViewById(R.id.chatWindow)

        sendButton.setOnClickListener {
            val userMessage = inputBox.text.toString()
            chatWindow.append("You: $userMessage\n")
            inputBox.text.clear()

            // Placeholder response
            val aiResponse = "Hello Jack, I heard you!"
            chatWindow.append("AI: $aiResponse\n")
        }
    }
}
