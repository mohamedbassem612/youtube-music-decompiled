package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
final class atvu {
    public static final /* synthetic */ int a = 0;

    private atvu() {
    }

    static byte[] a(attk attkVar) {
        Optional optionalOfNullable = Optional.ofNullable(attkVar);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(((attk) optionalOfNullable.get()).toByteArray());
        }
        return (byte[]) optionalOfNullable.orElse(new byte[0]);
    }
}
