package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qmb implements Comparable {
    public static final /* synthetic */ int b = 0;
    private static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(qmb.class, Object.class, "d");
    public final String a;
    private volatile Object d;

    public qmb(String str, byte[] bArr) {
        this.a = str;
        this.d = bArr;
    }

    public final void a(String str, agkx agkxVar) {
        Object obj = this.d;
        if (obj instanceof byte[]) {
            agkxVar.c(axfd.S(str, this.a, (byte[]) obj));
            return;
        }
        for (byte[] bArr : (byte[][]) obj) {
            agkxVar.c(axfd.S(str, this.a, bArr));
        }
    }

    public final void b(byte[] bArr) {
        Object obj;
        byte[][] bArr2;
        int i = 0;
        do {
            obj = this.d;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i])) {
                        return;
                    } else {
                        i++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
        } while (!a.aA(c, this, obj, bArr2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo((String) obj);
    }
}
