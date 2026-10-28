package defpackage;

import android.os.Parcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uwy implements uxa {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uwy(uxb uxbVar, Parcel parcel, int i) {
        this.$cid = i;
        this.b = uxbVar;
        this.a = parcel;
    }

    @Override // defpackage.uxa
    public final void a(arfu arfuVar) {
        if (this.$cid != 0) {
            int i = arfuVar.h;
            Parcel parcel = (Parcel) this.a;
            parcel.writeInt(i);
            parcel.writeFloat(((uxb) this.b).a(arfuVar));
            return;
        }
        StringBuilder sb = (StringBuilder) this.b;
        sb.append(' ');
        sb.append(arfuVar.name());
        sb.append('=');
        sb.append(((uxb) this.a).a(arfuVar));
    }

    public /* synthetic */ uwy(uxb uxbVar, StringBuilder sb, int i) {
        this.$cid = i;
        this.a = uxbVar;
        this.b = sb;
    }
}
