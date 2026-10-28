package defpackage;

import java.util.RandomAccess;
import org.chromium.base.AndroidInfo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class axik extends awne implements RandomAccess {
    public static final AndroidInfo c = new AndroidInfo();
    public final axii[] a;
    public final int[] b;

    public axik(axii[] axiiVarArr, int[] iArr) {
        this.a = axiiVarArr;
        this.b = iArr;
    }

    @Override // defpackage.awna
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.awna, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof axii) {
            return super.contains((axii) obj);
        }
        return false;
    }

    @Override // defpackage.awne, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.awne, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof axii) {
            return super.indexOf((axii) obj);
        }
        return -1;
    }

    @Override // defpackage.awne, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof axii) {
            return super.lastIndexOf((axii) obj);
        }
        return -1;
    }
}
