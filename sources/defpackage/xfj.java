package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xfj implements agek {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ long a;

    public /* synthetic */ xfj(long j, int i) {
        this.$cid = i;
        this.a = j;
    }

    @Override // defpackage.agek
    public final Object apply(Object obj) {
        switch (this.$cid) {
            case 0:
                int i = xfn.m;
                aihf builder = ((atox) obj).toBuilder();
                builder.copyOnWrite();
                atox atoxVar = (atox) builder.instance;
                atoxVar.b |= 1;
                atoxVar.c = this.a;
                return (atox) builder.build();
            case 1:
                aihf builder2 = ((atoq) obj).toBuilder();
                builder2.copyOnWrite();
                atoq atoqVar = (atoq) builder2.instance;
                atoqVar.b |= 1;
                atoqVar.c = this.a;
                return (atoq) builder2.build();
            case 2:
                zje zjeVar = (zje) obj;
                int i2 = (int) zjeVar.b;
                long j = zjeVar.a - this.a;
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                sb.append('t');
                sb.append(j);
                return sb.toString();
            case 3:
                aihf builder3 = ((atpl) obj).toBuilder();
                builder3.cL("last_playback_start_timestamp", this.a);
                return (atpl) builder3.build();
            case 4:
                aihf builder4 = ((atpq) obj).toBuilder();
                builder4.copyOnWrite();
                atpq atpqVar = (atpq) builder4.instance;
                atpqVar.b |= 32;
                atpqVar.h = this.a;
                return (atpq) builder4.build();
            case 5:
                aihf builder5 = ((atpq) obj).toBuilder();
                builder5.copyOnWrite();
                atpq atpqVar2 = (atpq) builder5.instance;
                atpqVar2.b |= 8;
                atpqVar2.f = this.a;
                return (atpq) builder5.build();
            case 6:
                aihf builder6 = ((atpt) obj).toBuilder();
                builder6.copyOnWrite();
                atpt atptVar = (atpt) builder6.instance;
                atptVar.b |= 2;
                atptVar.e = this.a;
                return (atpt) builder6.build();
            default:
                aihf builder7 = ((aeje) obj).toBuilder();
                builder7.copyOnWrite();
                aeje aejeVar = (aeje) builder7.instance;
                aejeVar.b |= 2;
                aejeVar.d = this.a;
                return (aeje) builder7.build();
        }
    }
}
