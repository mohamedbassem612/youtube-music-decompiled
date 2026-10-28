package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aadr implements aafu {
    private final awmd a;
    private final awmd b;

    public aadr(awmd awmdVar, awmd awmdVar2) {
        this.a = awmdVar;
        this.b = awmdVar2;
    }

    @Override // defpackage.aafu
    public final void b(Set set, String str, boolean z) {
        ((aaew) this.a.io()).t(set, str);
    }

    @Override // defpackage.aafu
    public final boolean c(String str, int i) {
        if (!((aado) this.b.io()).C()) {
            return false;
        }
        typ.f(str);
        return ((aaew) this.a.io()).w(str, i);
    }

    @Override // defpackage.aafu
    public final boolean d(aaml aamlVar) {
        if (((aado) this.b.io()).C()) {
            return ((aaew) this.a.io()).y(aamlVar);
        }
        return false;
    }

    @Override // defpackage.aafu
    public final boolean e(String str, int i, long j, boolean z) {
        if (!((aado) this.b.io()).C()) {
            return false;
        }
        typ.f(str);
        return ((aaew) this.a.io()).F(str, i, j);
    }

    @Override // defpackage.aafu
    public final boolean f(String str, int i, String str2) {
        if (!((aado) this.b.io()).C()) {
            return false;
        }
        ((aaew) this.a.io()).U(str, i, str2);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d8  */
    @Override // defpackage.aafu
    public final aamm g(String str, axmq axmqVar) {
        aamm aammVar;
        typ.f(str);
        if (((aado) this.b.io()).C()) {
            aaew aaewVar = (aaew) this.a.io();
            typ.f(str);
            aagk aagkVarR = aaewVar.b.r(str);
            if (aagkVarR != null) {
                synchronized (aagkVarR.e.k) {
                    try {
                        if (axmqVar == null) {
                            return aagkVarR.d();
                        }
                        int i = 0;
                        aaml aamlVar = null;
                        aaml aamlVar2 = null;
                        while (true) {
                            SparseArray sparseArray = aagkVarR.a;
                            if (i >= sparseArray.size()) {
                                break;
                            }
                            aaml aamlVar3 = (aaml) sparseArray.valueAt(i);
                            aihh aihhVar = (aihh) aamlVar3.c.b.toBuilder();
                            Uri uriG = isi.G((abtd) axmqVar.b, aamlVar3.g(), aamlVar3.a(), ((alaw) aihhVar.instance).r, aamlVar3.b(), ((alaw) aihhVar.instance).p, axmqVar.a);
                            String string = uriG == null ? "" : uriG.toString();
                            aihhVar.copyOnWrite();
                            alaw alawVar = (alaw) aihhVar.instance;
                            string.getClass();
                            alawVar.c |= 2;
                            alawVar.f = string;
                            aamk aamkVarD = aamlVar3.d();
                            aamkVarD.e(new wgs((alaw) aihhVar.build(), aamlVar3.g(), false, null));
                            aaml aamlVarA = aamkVarD.a();
                            if (!aamlVarA.d || aamlVarA.c.aa()) {
                                aamlVar = aamlVarA;
                            } else {
                                aamlVar2 = aamlVarA;
                            }
                            i++;
                        }
                        aammVar = null;
                        if (aamlVar != null || aamlVar2 != null) {
                            return new aamm(aamlVar, aamlVar2, aagkVarR.c, aagkVarR.d);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else {
                aammVar = null;
            }
        } else {
            aammVar = null;
        }
        return aammVar;
    }

    @Override // defpackage.aafu
    public final void a(String str, aamm aammVar) {
    }
}
