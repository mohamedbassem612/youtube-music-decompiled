package defpackage;

import j$.util.Optional;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class acpr implements avnn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public acpr(avlh avlhVar, int i) {
        this.$cid = i;
        this.a = avlhVar;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v25, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v33, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v49, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v51, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v53, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [awqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [awqg, java.lang.Object] */
    @Override // defpackage.avnn
    public final Object a(Object obj) {
        Object obj2;
        switch (this.$cid) {
            case 0:
                return a.m(this.a, obj);
            case 1:
                return ((aazq) this.a).b;
            case 2:
                return a.m(this.a, obj);
            case 3:
                return a.m(this.a, obj);
            case 4:
                obj.getClass();
                return this.a.invoke(obj);
            case 5:
                Optional optional = (Optional) obj;
                Optional optionalOfNullable = true != optional.isPresent() ? optional : Optional.ofNullable(((aciz) optional.get()).b);
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((acra) optionalOfNullable.get()).i);
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((acrp) optionalOfNullable.get()).H());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(((acvv) optionalOfNullable.get()).b());
                }
                if (true == optionalOfNullable.isPresent()) {
                    optionalOfNullable = Optional.ofNullable(Boolean.FALSE);
                }
                yyj yyjVar = new yyj(this.a, optional, 4, null);
                if (true != optionalOfNullable.isPresent()) {
                    Object obj3 = yyjVar.b;
                    Object objOfNullable = yyjVar.a;
                    Optional optional2 = (Optional) objOfNullable;
                    if (true == optional2.isPresent()) {
                        objOfNullable = Optional.ofNullable(null);
                    }
                    Optional optional3 = (Optional) objOfNullable;
                    if (true == optional3.isPresent()) {
                        objOfNullable = Optional.ofNullable(Boolean.valueOf(((acpp) optional3.get()).a()));
                    }
                    obj2 = (Boolean) ((Optional) objOfNullable).orElse(Boolean.valueOf(((acqz) obj3).ai));
                } else {
                    obj2 = optionalOfNullable.get();
                }
                return (Boolean) obj2;
            case 6:
                obj.getClass();
                return this.a.invoke(obj);
            case 7:
                obj.getClass();
                return this.a.invoke(obj);
            case 8:
                return a.z(this.a, obj);
            case 9:
                String str = actj.a;
                obj.getClass();
                return this.a.invoke(obj);
            case 10:
                obj.getClass();
                return this.a.invoke(obj);
            case 11:
                return a.z(this.a, obj);
            case 12:
                Optional optionalOfNullable2 = (Optional) obj;
                adha adhaVar = new adha(((aeas) this.a).a, 7);
                if (true == optionalOfNullable2.isPresent()) {
                    optionalOfNullable2 = Optional.ofNullable(((abgo) adhaVar.a).b((String) optionalOfNullable2.get()));
                }
                return (avlu) optionalOfNullable2.orElse(avlr.z());
            case 13:
                return Boolean.valueOf(((aeog) this.a).f());
            case 14:
                return a.m(this.a, obj);
            case 15:
                return a.m(this.a, obj);
            case 16:
                return a.m(this.a, obj);
            case 17:
                return ((avrz) this.a).d.a(new Object[]{obj});
            default:
                Object objA = ((avxy) this.a).e.a(new Object[]{obj});
                objA.getClass();
                return objA;
        }
    }

    public /* synthetic */ acpr(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }
}
