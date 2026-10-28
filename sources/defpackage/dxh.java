package defpackage;

import android.hardware.input.InputManager;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dxh implements InputManager.InputDeviceListener {
    final /* synthetic */ dxi a;

    public dxh(dxi dxiVar) {
        this.a = dxiVar;
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceAdded(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceChanged(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        reentrantLock.unlock();
    }

    @Override // android.hardware.input.InputManager.InputDeviceListener
    public final void onInputDeviceRemoved(int i) {
        dxi dxiVar = this.a;
        ReentrantLock reentrantLock = dxiVar.a;
        reentrantLock.lock();
        try {
            Set set = dxiVar.d;
            Integer numValueOf = Integer.valueOf(i);
            set.remove(numValueOf);
            Set set2 = dxiVar.e;
            set2.remove(numValueOf);
            boolean zIsEmpty = set.isEmpty();
            boolean z = true;
            boolean z2 = (zIsEmpty || set2.isEmpty()) ? false : true;
            if (dxiVar.c != z2) {
                dxiVar.c = z2;
            } else {
                z = false;
            }
            reentrantLock.unlock();
            if (z) {
                dxi dxiVar2 = this.a;
                ReentrantLock reentrantLock2 = dxiVar2.a;
                reentrantLock2.lock();
                try {
                    Map mapD = atqq.D(dxiVar2.b);
                    reentrantLock2.unlock();
                    ReentrantLock reentrantLock3 = dxiVar2.a;
                    reentrantLock3.lock();
                    try {
                        boolean z3 = dxiVar2.c;
                        reentrantLock3.unlock();
                        for (Map.Entry entry : mapD.entrySet()) {
                            ((Executor) entry.getValue()).execute(new csd((axo) entry.getKey(), z3, 2));
                        }
                    } catch (Throwable th) {
                        reentrantLock3.unlock();
                        throw th;
                    }
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }
}
