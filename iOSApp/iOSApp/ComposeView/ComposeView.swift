//
//  ComposeView.swift
//  iosApp
//
//  Created by BELDIN Yaroslav on 23.03.2025.
//

import Shared
import SwiftUI

struct ComposeView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        RootViewKt.MainViewController()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
    }
}
