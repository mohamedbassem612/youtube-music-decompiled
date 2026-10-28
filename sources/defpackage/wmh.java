package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wmh extends awrb implements awqk {
    public static final wmh a = new wmh();

    public wmh() {
        super(2, Integer.TYPE, "plus", "plus(I)I", 0);
    }

    @Override // defpackage.awqk
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj).intValue() + ((Number) obj2).intValue());
    }
}
