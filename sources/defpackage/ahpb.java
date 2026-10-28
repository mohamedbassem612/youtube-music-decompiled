package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahpb implements ahrs {
    public static final ahrs a = new ahpa();
    public volatile ahrs b;

    public ahpb(ahrs ahrsVar) {
        this.b = ahrsVar;
    }

    @Override // defpackage.ahrs
    public final Object a() {
        return this.b.a();
    }
}
