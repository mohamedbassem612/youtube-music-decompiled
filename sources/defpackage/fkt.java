package defpackage;

import android.util.SparseIntArray;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fkt implements Cloneable {
    public final fgy a;
    public final fhd b;
    public final fky c;
    public final fko d;
    public SparseIntArray e;
    public final fip f;
    public List g;
    public Map mManualKeysCounter;

    public fkt(fgy fgyVar, fhd fhdVar, fip fipVar) {
        this.a = fgyVar;
        this.b = fhdVar;
        this.c = fgyVar.u();
        this.d = fgyVar.t();
        this.f = fipVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fkt clone() {
        try {
            return (fkt) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
