package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aefp extends WeakReference {
    public final String a;

    public aefp(View view, ReferenceQueue referenceQueue, String str) {
        super(view, referenceQueue);
        this.a = str;
    }
}
