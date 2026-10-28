package com.google.protobuf;

import defpackage.aigx;
import defpackage.aihe;
import defpackage.aihl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ExtensionRegistryLite {
    public static final ExtensionRegistryLite a = new ExtensionRegistryLite(null);
    public static volatile int c = 1;
    private static volatile boolean d = false;
    private static volatile ExtensionRegistryLite e;
    public final byte b;
    private final Map f;

    public ExtensionRegistryLite() {
        this.b = (byte) -1;
        this.f = new HashMap();
    }

    public static ExtensionRegistryLite getGeneratedRegistry() {
        ExtensionRegistryLite extensionRegistryLiteB;
        ExtensionRegistryLite extensionRegistryLite = e;
        if (extensionRegistryLite != null) {
            return extensionRegistryLite;
        }
        synchronized (ExtensionRegistryLite.class) {
            extensionRegistryLiteB = e;
            if (extensionRegistryLiteB == null) {
                extensionRegistryLiteB = aihe.b(ExtensionRegistryLite.class);
                e = extensionRegistryLiteB;
            }
        }
        return extensionRegistryLiteB;
    }

    public aihl a(MessageLite messageLite, int i) {
        return (aihl) this.f.get(new aigx(messageLite, i));
    }

    public final void b(aihl aihlVar) {
        this.f.put(new aigx(aihlVar.a, aihlVar.a()), aihlVar);
    }

    public ExtensionRegistryLite(byte[] bArr) {
        this.b = (byte) -1;
        this.f = Collections.EMPTY_MAP;
    }
}
