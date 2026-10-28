package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class awvn implements awvz {
    public final boolean a;

    public awvn(boolean z) {
        this.a = z;
    }

    @Override // defpackage.awvz
    public final awwp ku() {
        return null;
    }

    @Override // defpackage.awvz
    public final boolean kw() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append('}');
        return sb.toString();
    }
}
