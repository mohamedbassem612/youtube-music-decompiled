package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ahnu extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahnu(String str) {
        super(str);
        kro.j(str, "Detail message must not be empty");
    }

    @Deprecated
    protected ahnu() {
    }
}
