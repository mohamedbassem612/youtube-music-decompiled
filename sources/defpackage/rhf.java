package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rhf {
    public static final rhf a = new rhf(null, null, null);
    public static final rhf b = new rhf(null, null, null);
    public final rfs c;
    public final rfs d;
    public final atwa e;

    public rhf(rfs rfsVar, rfs rfsVar2, atwa atwaVar) {
        this.c = rfsVar;
        this.d = rfsVar2;
        this.e = atwaVar;
    }

    public final void a() {
        Optional optionalOfNullable = Optional.ofNullable(this.c);
        if (true == optionalOfNullable.isPresent()) {
            ((rfs) optionalOfNullable.get()).release();
        }
        Optional optionalOfNullable2 = Optional.ofNullable(this.d);
        if (true == optionalOfNullable2.isPresent()) {
            ((rfs) optionalOfNullable2.get()).release();
        }
    }

    public final boolean b() {
        rfs rfsVar = this.c;
        Optional optionalOfNullable = Optional.ofNullable(rfsVar);
        if (true == optionalOfNullable.isPresent()) {
            optionalOfNullable = Optional.ofNullable(Boolean.valueOf(((rfs) optionalOfNullable.get()).z()));
        }
        Boolean bool = Boolean.TRUE;
        boolean zBooleanValue = ((Boolean) optionalOfNullable.orElse(bool)).booleanValue();
        rfs rfsVar2 = this.d;
        Optional optionalOfNullable2 = Optional.ofNullable(rfsVar2);
        if (true == optionalOfNullable2.isPresent()) {
            optionalOfNullable2 = Optional.ofNullable(Boolean.valueOf(((rfs) optionalOfNullable2.get()).z()));
        }
        boolean zBooleanValue2 = ((Boolean) optionalOfNullable2.orElse(bool)).booleanValue();
        if (zBooleanValue) {
            if (zBooleanValue2) {
                return true;
            }
            Optional optionalOfNullable3 = Optional.ofNullable(rfsVar);
            if (true == optionalOfNullable3.isPresent()) {
                ((rfs) optionalOfNullable3.get()).release();
            }
        }
        if (zBooleanValue2) {
            Optional optionalOfNullable4 = Optional.ofNullable(rfsVar2);
            if (true == optionalOfNullable4.isPresent()) {
                ((rfs) optionalOfNullable4.get()).release();
            }
        }
        return false;
    }
}
