package defpackage;

import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class jti extends Exception {
    public jti(UUID uuid) {
        super("Media does not support uuid: ".concat(String.valueOf(String.valueOf(uuid))));
    }
}
