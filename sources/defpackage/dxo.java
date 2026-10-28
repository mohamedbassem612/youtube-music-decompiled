package defpackage;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dxo implements Consumer2, axo {
    private final Context a;
    private final ReentrantLock b;
    private dwy c;
    private final Set d;

    public dxo(Context context) {
        context.getClass();
        this.a = context;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }

    @Override // androidx.window.reflection.Consumer2, androidx.window.extensions.core.util.function.Consumer
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            dwy dwyVarG = yi.g(this.a, windowLayoutInfo);
            this.c = dwyVarG;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((axo) it.next()).accept(dwyVarG);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void addListener(axo axoVar) {
        axoVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            dwy dwyVar = this.c;
            if (dwyVar != null) {
                axoVar.accept(dwyVar);
            }
            this.d.add(axoVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(axo axoVar) {
        axoVar.getClass();
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(axoVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
