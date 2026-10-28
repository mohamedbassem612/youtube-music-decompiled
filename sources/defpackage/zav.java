package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class zav extends zhn implements zjs {
    public final String d;

    public zav(byi byiVar, String str, String str2) {
        super(byiVar, str);
        this.d = str2;
    }

    @Override // defpackage.zjs
    public final String a(boolean z) {
        return true != z ? "staleconfig" : "manifest.unparseable";
    }

    @Override // defpackage.zjs
    public final String b() {
        return this.d;
    }
}
