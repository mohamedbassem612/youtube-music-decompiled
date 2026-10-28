package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aaqp {
    public final long a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public aaqp(String str, Set set, LinkedHashSet linkedHashSet, List list, List list2, long j) {
        this(agkj.j(str, set), agkj.j(str, linkedHashSet), agkj.j(str, list), list2 != null ? agkj.j(str, list2) : Collections.EMPTY_MAP, j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final LinkedHashSet a(String str) {
        LinkedHashSet linkedHashSet = (LinkedHashSet) this.c.get(str);
        return linkedHashSet == null ? new LinkedHashSet() : linkedHashSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List b(String str) {
        List list = (List) this.d.get(str);
        return list == null ? new ArrayList() : list;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List c(String str) {
        return (List) this.e.get(str);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cia, java.lang.Object] */
    public final long d() {
        return this.c.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [cia, java.lang.Object] */
    public final long e() {
        return this.c.f(this.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cia, java.lang.Object] */
    public final long f(long j) {
        long j2 = this.a;
        return h(j) + this.c.b(j, j2);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cia, java.lang.Object] */
    public final long g(long j) {
        return this.c.g(j, this.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cia, java.lang.Object] */
    public final long h(long j) {
        return this.c.h(j);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cia, java.lang.Object] */
    public final civ i(long j) {
        return this.c.i(j);
    }

    public final long j(cio cioVar, long j) {
        if (e() == -1) {
            long j2 = cioVar.f;
            if (j2 != -9223372036854775807L) {
                return Math.max(d(), g(((j - bwp.y(cioVar.a)) - bwp.y(cioVar.d(0).a)) - bwp.y(j2)));
            }
        }
        return d();
    }

    public final long k(cio cioVar, long j) {
        long jE = e();
        return (jE == -1 ? g((j - bwp.y(cioVar.a)) - bwp.y(cioVar.d(0).a)) : d() + jE) - 1;
    }

    public aaqp(Map map, Map map2, Map map3, Map map4, long j) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.a = j;
    }

    public aaqp(String str, String str2, String str3, long j, Object obj) {
        kro.i(str);
        kro.i(str3);
        this.b = str;
        this.e = str2;
        this.d = str3;
        this.a = j;
        this.c = obj;
    }

    public aaqp(long j, ciy ciyVar, wgs wgsVar, cpf cpfVar, cia ciaVar) {
        this.a = j;
        this.b = ciyVar;
        this.e = wgsVar;
        this.d = cpfVar;
        this.c = ciaVar;
    }
}
