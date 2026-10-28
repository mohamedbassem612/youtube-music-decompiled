package androidx.window.layout.adapter.extensions;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import defpackage.axo;
import defpackage.dwy;
import defpackage.yi;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class MulticastConsumer implements axo {
    public final ReentrantLock a = new ReentrantLock();
    public final Set b = new LinkedHashSet();
    private final Context c;
    private dwy d;

    public MulticastConsumer(Context context) {
        this.c = context;
    }

    public final void a(axo axoVar) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            dwy dwyVar = this.d;
            if (dwyVar != null) {
                axoVar.accept(dwyVar);
            }
            this.b.add(axoVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.axo
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        windowLayoutInfo.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            dwy dwyVarG = yi.g(this.c, windowLayoutInfo);
            this.d = dwyVarG;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((axo) it.next()).accept(dwyVarG);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
