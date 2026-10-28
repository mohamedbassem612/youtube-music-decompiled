package defpackage;

import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class wsi extends wlu {
    public String a;
    public final List b;
    public String c;
    public aigj d;
    private final Optional e;

    protected wsi(abxv abxvVar, zwa zwaVar, Optional optional) {
        super("browse/edit_playlist", abxvVar, zwaVar, 1, false, null, null);
        this.e = optional;
        this.b = new ArrayList();
    }

    @Override // defpackage.wlu
    public final /* synthetic */ aiir a() {
        aihf aihfVarCreateBuilder = alvx.a.createBuilder();
        String str = this.a;
        if (str != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alvx alvxVar = (alvx) aihfVarCreateBuilder.instance;
            alvxVar.b |= 2;
            alvxVar.d = str;
        }
        Optional optional = this.e;
        aihfVarCreateBuilder.getClass();
        vrl vrlVar = new vrl(aihfVarCreateBuilder, 12);
        if (true == optional.isPresent()) {
            Object obj = optional.get();
            aihf aihfVar = (aihf) vrlVar.a;
            aihfVar.copyOnWrite();
            alvx alvxVar2 = (alvx) aihfVar.instance;
            alvxVar2.g = (amyf) obj;
            alvxVar2.b |= 16;
        }
        List list = this.b;
        aihfVarCreateBuilder.copyOnWrite();
        alvx alvxVar3 = (alvx) aihfVarCreateBuilder.instance;
        aiie aiieVar = alvxVar3.e;
        if (!aiieVar.c()) {
            alvxVar3.e = aihn.mutableCopy(aiieVar);
        }
        aifs.addAll(list, alvxVar3.e);
        String str2 = this.c;
        if (str2 != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alvx alvxVar4 = (alvx) aihfVarCreateBuilder.instance;
            alvxVar4.b |= 4;
            alvxVar4.f = str2;
        }
        aigj aigjVar = this.d;
        if (aigjVar != null) {
            aihfVarCreateBuilder.copyOnWrite();
            alvx alvxVar5 = (alvx) aihfVarCreateBuilder.instance;
            alvxVar5.b |= 32;
            alvxVar5.h = aigjVar;
        }
        return aihfVarCreateBuilder;
    }

    @Override // defpackage.wkf
    protected final void b() {
        ahno.O(this.a != null);
        ahno.O(!this.b.isEmpty());
    }

    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.b.add((aote) it.next());
        }
    }
}
