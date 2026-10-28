package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ajxf implements weh {
    static final ajxe a;
    public static final weq b;
    private final ajxg c;

    static {
        ajxe ajxeVar = new ajxe();
        a = ajxeVar;
        b = ajxeVar;
    }

    public ajxf(ajxg ajxgVar) {
        this.c = ajxgVar;
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
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final ajxd d() {
        return new ajxd(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ajxf) && this.c.equals(((ajxf) obj).c);
    }

    public String getConfirmButtonA11Y() {
        return this.c.n;
    }

    public String getConfirmButtonDisabledA11Y() {
        return this.c.o;
    }

    public List getEmojiCategories() {
        return this.c.i;
    }

    public String getEmojiPickerButtonA11Y() {
        return this.c.s;
    }

    public Boolean getIsDismissFromConfirm() {
        return Boolean.valueOf(this.c.f);
    }

    public Boolean getIsDismissFromSend() {
        return Boolean.valueOf(this.c.e);
    }

    public Boolean getIsEmojiPickerEnabled() {
        return Boolean.valueOf(this.c.g);
    }

    public Boolean getIsEmojiPickerToggled() {
        return Boolean.valueOf(this.c.h);
    }

    public Boolean getIsSending() {
        return Boolean.valueOf(this.c.d);
    }

    public Boolean getIsTimestampButtonEnabled() {
        return Boolean.valueOf(this.c.k);
    }

    public Boolean getIsTimestampButtonSupported() {
        return Boolean.valueOf(this.c.j);
    }

    public String getSendButtonA11Y() {
        return this.c.l;
    }

    public String getSendButtonDisabledA11Y() {
        return this.c.m;
    }

    public String getShortCreationButtonA11Y() {
        return this.c.p;
    }

    public String getTimestampButtonA11Y() {
        return this.c.q;
    }

    public String getTimestampButtonDisabledA11Y() {
        return this.c.r;
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "CommentComposerButtonStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
