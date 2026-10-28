package defpackage;

import android.view.View;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aeet extends WeakReference {
    public final String a;

    public aeet(String str, View view, ReferenceQueue referenceQueue) {
        super(view, referenceQueue);
        this.a = str;
    }
}
