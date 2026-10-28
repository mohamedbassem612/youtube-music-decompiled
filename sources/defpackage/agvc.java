package defpackage;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class agvc extends agvd {
    private final agvb c;

    public agvc(agsr agsrVar, int i, agvb agvbVar) {
        super(agsrVar, i);
        this.c = agvbVar;
        StringBuilder sb = new StringBuilder("%");
        agsrVar.f(sb);
        sb.append(true != agsrVar.d() ? 't' : 'T');
        sb.append(agvbVar.G);
    }

    @Override // defpackage.agvd
    public final void a(agvh agvhVar, Object obj) {
        agvb agvbVar = this.c;
        if (!(obj instanceof Date) && !(obj instanceof Calendar) && !(obj instanceof Long)) {
            agvh.c(agvhVar.d, obj, "%t" + agvbVar.G);
            return;
        }
        agsr agsrVar = this.b;
        StringBuilder sb = new StringBuilder("%");
        agsrVar.f(sb);
        sb.append(true != agsrVar.d() ? 't' : 'T');
        sb.append(agvbVar.G);
        agvhVar.d.append(String.format(agsy.a, sb.toString(), obj));
    }
}
