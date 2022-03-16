package com.example.demo.view

import com.example.demo.app.Styles
import javafx.scene.text.Font
import javafx.scene.text.FontWeight
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = stackpane {
        hbox {

            paddingTop = 20
            paddingBottom = 20
            paddingRight = 40

            vbox(40) {
                vbox(20) {
                    hbox {
                        label("We are") {
                            font = Font.font("Segue UI", FontWeight.LIGHT, 30.0 )
                        }

                        label("NUVA") {
                            font = Font.font("Segue UI", FontWeight.LIGHT, 30.0 )
                        }
                    }

                    label("Welcome back!") {
                        isWrapText = true
                        maxWidth = 200.0
                    }
                }
            }
        }
}