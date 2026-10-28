package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class cjq extends Exception {
    public cjq(UUID uuid) {
        super("Media does not support uuid: ".concat(uuid.toString()));
    }
}
