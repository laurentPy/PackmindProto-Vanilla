// src/main/java/com/example/ui/DummyUi.java
package com.example.ui;

import com.example.core.CoreService;    // <-- forbidden import (will fail)

// This class is intentionally importing a class from the core package

public class DummyUi {
    private final CoreService svc = new CoreService();
}
