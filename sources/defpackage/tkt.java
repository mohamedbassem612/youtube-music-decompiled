package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class tkt extends thw {
    public tkt(String str) {
        super(str);
    }

    @Override // defpackage.thw
    protected final boolean a(String str) {
        return !"Accept-Encoding".equalsIgnoreCase(str);
    }
}
