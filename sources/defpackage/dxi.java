package defpackage;

import android.hardware.input.InputManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dxi implements AutoCloseable {
    public boolean c;
    private final dov g;
    public final ReentrantLock a = new ReentrantLock();
    public final Map b = new LinkedHashMap();
    public final Set d = new LinkedHashSet();
    public final Set e = new LinkedHashSet();
    private final dxh f = new dxh(this);

    public dxi(dov dovVar) {
        this.g = dovVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        dxh dxhVar = this.f;
        dxhVar.getClass();
        ((InputManager) this.g.a).unregisterInputDeviceListener(dxhVar);
    }
}
