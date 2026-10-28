package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wvz {
    public final akuo a;
    public final akrn b;
    public final amqm c;

    public wvz(akuo akuoVar, akrn akrnVar, amqm amqmVar) {
        this.a = akuoVar;
        this.b = akrnVar;
        this.c = amqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wvz) {
            wvz wvzVar = (wvz) obj;
            if (awrc.c(this.a, wvzVar.a) && awrc.c(this.b, wvzVar.b) && awrc.c(this.c, wvzVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        akuo akuoVar = this.a;
        int iHashCode = akuoVar == null ? 0 : akuoVar.hashCode();
        akrn akrnVar = this.b;
        return (((iHashCode * 31) + (akrnVar != null ? akrnVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "LiveChatEngagementPanelModel(headerRenderer=" + this.a + ", elementHeaderRenderer=" + this.b + ", liveChatRenderer=" + this.c + ')';
    }
}
