package defpackage;

import app.rive.semantics.SemanticState;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adhf {
    public final vxe a;
    public final wek b;
    public final adhe c;
    public final Map d;
    public final awli e;
    public final String f;
    public final String g;
    public final Set h;
    public Optional i;
    public Optional j;
    public Optional k;
    public Optional l;
    private final avmb m;
    private avmn n;

    public adhf(vxe vxeVar, wbz wbzVar, avmb avmbVar, zwb zwbVar, akzv akzvVar, adhe adheVar) {
        ajwo ajwoVar;
        agkj agkjVarH = agkj.h(new HashMap());
        if (agkjVarH == null) {
            throw new IllegalStateException("Missing required properties: steps");
        }
        adhd adhdVar = new adhd(agkjVarH);
        this.h = new HashSet();
        this.i = Optional.empty();
        this.j = Optional.empty();
        this.k = Optional.empty();
        this.l = Optional.empty();
        Optional.empty();
        this.a = vxeVar;
        this.b = wbzVar.b(zwbVar.e());
        this.m = avmbVar;
        this.c = adheVar;
        HashMap map = new HashMap();
        this.d = map;
        this.e = new awli(new Object());
        b(map, a(akzvVar.e));
        map.putAll(adhdVar.a);
        this.f = akzvVar.c;
        this.g = akzvVar.f;
        if ((akzvVar.b & 64) != 0) {
            ajwo ajwoVar2 = akzvVar.g;
            this.i = Optional.of(ajwoVar2 == null ? ajwo.a : ajwoVar2);
        }
        if ((akzvVar.b & SemanticState.Focused) != 0) {
            ajwoVar = akzvVar.h;
            if (ajwoVar == null) {
                ajwoVar = ajwo.a;
            }
        } else {
            ajwoVar = null;
        }
        this.j = Optional.ofNullable(ajwoVar);
        if ((akzvVar.b & SemanticState.Obscured) != 0) {
            ajwo ajwoVar3 = akzvVar.k;
            Optional.of(ajwoVar3 == null ? ajwo.a : ajwoVar3);
        }
    }

    public static List a(List list) {
        return (List) Collection.EL.stream(list).filter(new acwb(2)).map(new accu(9)).collect(Collectors.toCollection(new yoj(14)));
    }

    public static void b(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            alae alaeVar = (alae) it.next();
            map.put(alaeVar.c, alaeVar);
        }
    }

    public final void c() {
        d();
        int i = 0;
        this.n = avlr.j(this.b.j(this.g, true).B(new adhb(i)), this.e, new abiw(7)).K(new adhc(i)).h(akzz.class).O(this.m).K(new adhc(2)).af(new acym(this, 5));
    }

    public final void d() {
        Object obj = this.n;
        if (obj != null) {
            avnr.b((AtomicReference) obj);
            this.n = null;
        }
    }
}
