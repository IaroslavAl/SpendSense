//
//  ContentView.swift
//  iOSApp
//
//  Created by BELDIN Yaroslav on 22.03.2025.
//

import SwiftUI
import shared

struct ContentView: View {
    var body: some View {
        ZStack {
            ComposeView()
        }
    }
}

struct ComposeView: UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {}
    
    func makeUIViewController(context: Context) -> some UIViewController {
        RootViewKt.MainViewController()
    }
}

#Preview {
    ContentView()
}
