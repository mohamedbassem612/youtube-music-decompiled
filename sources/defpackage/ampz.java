package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ampz implements weh {
    static final ampy a;
    public static final weq b;
    public final amqb c;

    static {
        ampy ampyVar = new ampy();
        a = ampyVar;
        b = ampyVar;
    }

    public ampz(amqb amqbVar) {
        this.c = amqbVar;
    }

    @Override // defpackage.weh
    public final agkz a() {
        agkx agkxVar = new agkx();
        for (ampv ampvVar : new agok(getPollChoiceStatesMap())) {
            agkxVar.j(new agkx().g());
        }
        return agkxVar.g();
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
        return new ampx(this.c.toBuilder());
    }

    @Override // defpackage.weh
    public final boolean equals(Object obj) {
        return (obj instanceof ampz) && this.c.equals(((ampz) obj).c);
    }

    public alay getCollapsedMetadataText() {
        alay alayVar = this.c.e;
        return alayVar == null ? alay.a : alayVar;
    }

    public alay getMetadataText() {
        alay alayVar = this.c.d;
        return alayVar == null ? alay.a : alayVar;
    }

    public Map getPollChoiceStatesMap() {
        return aguu.p(DesugarCollections.unmodifiableMap(this.c.f), new ampw(0));
    }

    public String getPostVoteCountText() {
        return this.c.h;
    }

    public String getPreVoteCountText() {
        return this.c.g;
    }

    public Integer getTotalVoteCount() {
        return Integer.valueOf(this.c.i);
    }

    @Override // defpackage.weh
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LiveChatPollStateEntityModel{" + String.valueOf(this.c) + '}';
    }

    public weq getType() {
        return b;
    }
}
