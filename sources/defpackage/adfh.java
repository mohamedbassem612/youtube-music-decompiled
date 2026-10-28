package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adfh implements tae {
    private final /* synthetic */ int $cid;
    private final asnm a;
    private final WeakReference b;
    private final boolean c;

    public adfh(asnm asnmVar, adfc adfcVar, boolean z, int i, byte[] bArr) {
        this.$cid = i;
        this.a = asnmVar;
        this.b = new WeakReference(adfcVar);
        this.c = z;
    }

    @Override // defpackage.tae, defpackage.twi
    public final /* synthetic */ void a(Object obj) {
        if (this.$cid != 0) {
            Drawable drawable = (Drawable) obj;
            adfc adfcVar = (adfc) this.b.get();
            if (adfcVar == null || adfcVar.getDrawable() != null) {
                return;
            }
            int i = adfcVar.B;
            int iBc = a.bc(this.a.d);
            if (iBc == 0) {
                iBc = 1;
            }
            adfcVar.B = iBc;
            if (this.c) {
                adfcVar.w = true;
                adfcVar.setImageDrawable(drawable);
                adfcVar.w = false;
            } else {
                adfcVar.setImageDrawable(drawable);
            }
            adfcVar.B = i;
            return;
        }
        Drawable drawable2 = (Drawable) obj;
        adfc adfcVar2 = (adfc) this.b.get();
        if (adfcVar2 == null || adfcVar2.getDrawable() != null) {
            return;
        }
        int i2 = adfcVar2.B;
        int iBc2 = a.bc(this.a.d);
        if (iBc2 == 0) {
            iBc2 = 1;
        }
        adfcVar2.B = iBc2;
        if (this.c) {
            adfcVar2.w = true;
            adfcVar2.setImageDrawable(drawable2);
            adfcVar2.w = false;
        } else {
            adfcVar2.setImageDrawable(drawable2);
        }
        adfcVar2.B = i2;
    }

    public adfh(asnm asnmVar, adfc adfcVar, boolean z, int i) {
        this.$cid = i;
        this.a = asnmVar;
        this.b = new WeakReference(adfcVar);
        this.c = z;
    }
}
