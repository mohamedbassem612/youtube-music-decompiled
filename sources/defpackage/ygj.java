package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.proto.FormatInitializationMetadataOuterClass$FormatInitializationMetadata;
import j$.util.Comparator$CC;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class ygj {
    public long a;
    public final TreeSet b;
    public final TreeSet c;
    public final TreeSet d;
    public final boolean e;
    public String f;
    public FormatInitializationMetadataOuterClass$FormatInitializationMetadata g;

    public ygj(boolean z, boolean z2) {
        this.e = z;
        this.b = new TreeSet(z2 ? ygl.a : Comparator$CC.comparing(new ygi(1)));
        this.c = new TreeSet(z2 ? ygl.b : Comparator$CC.comparing(new ygi(0)));
        this.d = new TreeSet();
        this.f = null;
        this.g = null;
    }

    public static final yfr b(yez yezVar) {
        long j = yezVar.d;
        return new yfr(j, yezVar.e + j);
    }

    public final void a(yez yezVar, String str) {
        this.b.add(yezVar);
        if ((yezVar.b & 4) != 0) {
            this.c.add(yezVar);
            if (this.e) {
                zik.bz(this.d, b(yezVar));
            }
        }
        this.a += yezVar.g;
        if (!TextUtils.isEmpty(this.f) || TextUtils.isEmpty(str)) {
            return;
        }
        this.f = str;
    }
}
