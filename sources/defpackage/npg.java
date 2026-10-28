package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.DebuggerInfoWrapper;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class npg extends DebuggerInfoWrapper {
    public Component b;
    public final String c;
    private asrl f;
    public final awlo a = new awlo();
    public final ArrayList d = new ArrayList();
    public final Object e = new Object();

    public npg(String str, Component component) {
        this.c = str;
        this.b = component;
    }

    public final asrl a() {
        asrl asrlVar;
        synchronized (this.e) {
            asrlVar = this.f;
        }
        return asrlVar;
    }

    public final void b() {
        synchronized (this.e) {
            this.b = null;
        }
    }

    public final void c(asrl asrlVar) {
        synchronized (this.e) {
            this.f = asrlVar;
        }
    }

    @Override // com.google.android.libraries.elements.interfaces.DebuggerInfoWrapper
    public final String getDebuggerId() {
        return this.c;
    }

    public final String toString() {
        asrl asrlVar = this.f;
        StringBuilder sb = new StringBuilder("DebuggerInfo(");
        sb.append(this.c);
        sb.append(", ");
        sb.append(asrlVar != null);
        sb.append(')');
        return sb.toString();
    }
}
