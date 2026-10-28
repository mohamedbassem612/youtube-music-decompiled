package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class amut implements weh {
    static final amus a;
    public static final weq b;
    private final amuu c;

    static {
        amus amusVar = new amus();
        a = amusVar;
        b = amusVar;
    }

    public amut(amuu amuuVar) {
        this.c = amuuVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        return new agkx().g();
    }

    @Override // defpackage.weh
    public final String b() {
        return this.c.c;
    }

    @Override // defpackage.weh
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.weh
    public final /* bridge */ /* synthetic */ tzk d() {
        return new amur(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof amut) && this.c.equals(((amut) obj).c);
    }

    public Long getDisplayCharacterCount() {
        return Long.valueOf(this.c.h);
    }

    public Boolean getEditableTextIsFocused() {
        return Boolean.valueOf(this.c.g);
    }

    public List getEmojiRuns() {
        return this.c.f;
    }

    public String getMessage() {
        return this.c.d;
    }

    public amqw getRichMessage() {
        amqw amqwVar = this.c.e;
        return amqwVar == null ? amqw.a : amqwVar;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LoyaltyMessageEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
