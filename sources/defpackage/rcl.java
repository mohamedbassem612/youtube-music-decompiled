package defpackage;

import j$.util.Collection;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.UUID;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class rcl extends qvs {
    public static final /* synthetic */ int l = 0;
    public final agke k;
    private final agke r;

    private rcl(rcl rclVar) {
        super(rclVar);
        int i = 13;
        Stream map = Collection.EL.stream(rclVar.r).map(new rcf(i));
        Collector collector = aghu.a;
        this.r = (agke) map.collect(collector);
        this.k = (agke) Collection.EL.stream(rclVar.k).map(new rcf(i)).collect(collector);
    }

    @Override // defpackage.qvu
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ qvu clone() {
        return new rcl(this);
    }

    @Override // defpackage.qvu
    public final /* synthetic */ Object clone() {
        return new rcl(this);
    }

    public rcl(UUID uuid, agke agkeVar, agke agkeVar2) {
        super(uuid);
        this.r = agkeVar;
        this.k = agkeVar2;
    }
}
