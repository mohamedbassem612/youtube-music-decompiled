package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ead extends doc {
    public static final ead c = new ead();

    private ead() {
        super(12, 13);
    }

    @Override // defpackage.doc
    public final void a(dpd dpdVar) {
        dpdVar.e("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        dpdVar.e("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
