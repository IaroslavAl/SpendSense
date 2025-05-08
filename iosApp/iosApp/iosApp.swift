//
//  iosApp.swift
//  iosApp
//
//  Created by BELDIN Yaroslav on 23.03.2025.
//

import Shared
import SwiftUI

@main
struct iosApp: App {

    init() {
        IosKoin.shared.initialize(userDefaults: UserDefaults())
    }

    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
