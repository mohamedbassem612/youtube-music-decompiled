package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class ptl extends doc {
    public ptl() {
        super(1, 2);
    }

    @Override // defpackage.doc
    public final void b(dpt dptVar) {
        azu.i(dptVar, "ALTER TABLE `threads` ADD COLUMN `rendering_metadata` BLOB NOT NULL DEFAULT X''");
    }
}
