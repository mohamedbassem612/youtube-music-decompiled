package defpackage;

import android.graphics.Rect;
import java.util.Comparator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class bdo implements Comparator {
    private final Rect a = new Rect();
    private final Rect b = new Rect();
    private final boolean c;
    private final bdm d;

    public bdo(boolean z, bdm bdmVar) {
        this.c = z;
        this.d = bdmVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        bdm bdmVar = this.d;
        Rect rect = this.a;
        bdmVar.a(obj, rect);
        Rect rect2 = this.b;
        bdmVar.a(obj2, rect2);
        int i = -1;
        if (rect.top < rect2.top) {
            return -1;
        }
        int i2 = 1;
        if (rect.top <= rect2.top) {
            if (rect.left < rect2.left) {
                if (!this.c) {
                    return i;
                }
            } else if (rect.left > rect2.left) {
                i2 = -1;
                i = 1;
                if (!this.c) {
                    return i;
                }
            } else {
                if (rect.bottom < rect2.bottom) {
                    return -1;
                }
                if (rect.bottom <= rect2.bottom) {
                    if (rect.right >= rect2.right) {
                        if (rect.right <= rect2.right) {
                            return 0;
                        }
                        i2 = -1;
                        i = 1;
                    }
                    if (!this.c) {
                        return i;
                    }
                }
            }
        }
        return i2;
    }
}
