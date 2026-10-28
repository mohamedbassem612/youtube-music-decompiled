package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class hfu implements xgn {
    public xgz a = null;
    private final xgn b;

    public hfu(xgn xgnVar) {
        this.b = xgnVar;
    }

    private final void E() {
        xgz xgzVar = this.a;
        if (xgzVar != null) {
            d(xgzVar);
        }
    }

    @Override // defpackage.xhz
    public final void A(xgz xgzVar, amdd amddVar) {
        this.b.A(xgzVar, amddVar);
    }

    @Override // defpackage.xgn
    public final void B() {
        this.b.B();
    }

    @Override // defpackage.xgn
    public final void C(xgt xgtVar) {
        this.b.C(xgtVar);
    }

    @Override // defpackage.xgn
    public final xgt D(xhc xhcVar, xgu xguVar, ajwo ajwoVar) {
        xgt xgtVarD = this.b.D(xhcVar, xguVar, ajwoVar);
        E();
        return xgtVarD;
    }

    @Override // defpackage.xgn
    public final xgt a() {
        return this.b.a();
    }

    @Override // defpackage.xgn
    public final xgt b(xhc xhcVar, ajwo ajwoVar, amdd amddVar) {
        xgt xgtVarB = this.b.b(xhcVar, ajwoVar, amddVar);
        E();
        return xgtVarB;
    }

    @Override // defpackage.xgn
    public final xgt c(xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2) {
        xgt xgtVarC = this.b.c(xhcVar, xguVar, ajwoVar, amddVar, amddVar2);
        E();
        return xgtVarC;
    }

    @Override // defpackage.xhy
    public final xhz d(xgz xgzVar) {
        return this.b.d(xgzVar);
    }

    @Override // defpackage.xhy
    public final xhz e(xgz xgzVar, xgz xgzVar2) {
        return this.b.e(xgzVar, xgzVar2);
    }

    @Override // defpackage.xhy
    public final ajwo f(ajwo ajwoVar) {
        return this.b.f(ajwoVar);
    }

    @Override // defpackage.xgn
    public final argn g(Object obj, xhc xhcVar) {
        return this.b.g(obj, xhcVar);
    }

    @Override // defpackage.xgn
    public final argn h(Object obj, xhc xhcVar, int i) {
        return this.b.h(obj, xhcVar, i);
    }

    @Override // defpackage.xhy
    public final String i() {
        return this.b.i();
    }

    @Override // defpackage.xgn
    public final void j(Object obj, xhc xhcVar, int i) {
        this.b.j(obj, xhcVar, i);
    }

    @Override // defpackage.xgn
    public final void k(List list) {
        this.b.k(list);
    }

    @Override // defpackage.xgn
    public final void l(xgz xgzVar) {
        this.b.l(xgzVar);
    }

    @Override // defpackage.xgn
    public final void m(xgz xgzVar, xgz xgzVar2) {
        this.b.m(xgzVar, xgzVar2);
    }

    @Override // defpackage.xgn
    public final /* synthetic */ void n(List list) {
        yno.dm();
    }

    @Override // defpackage.xhz
    public final void o(ameb amebVar, xgz xgzVar, amdd amddVar) {
        this.b.o(amebVar, xgzVar, amddVar);
    }

    @Override // defpackage.xhz
    public final void p(xgz xgzVar, amdd amddVar) {
        this.b.p(xgzVar, amddVar);
    }

    @Override // defpackage.xhz
    public final void q(xgz xgzVar, atqe atqeVar, amdd amddVar) {
        this.b.q(xgzVar, atqeVar, amddVar);
    }

    @Override // defpackage.xhy
    public final void r(String str) {
        this.b.r(str);
    }

    @Override // defpackage.xhy
    public final void s(xgz xgzVar, String str) {
        this.b.s(xgzVar, str);
    }

    @Override // defpackage.xhy
    public final void t() {
        this.b.t();
    }

    @Override // defpackage.xgn
    public final void u() {
        this.b.u();
    }

    @Override // defpackage.xgn
    public final void v() {
        this.b.v();
    }

    @Override // defpackage.xhz
    public final void w(xgz xgzVar, amdd amddVar) {
        this.b.w(xgzVar, amddVar);
    }

    @Override // defpackage.xhz
    public final void x(xgz xgzVar, atqd atqdVar, amdd amddVar) {
        this.b.x(xgzVar, atqdVar, amddVar);
    }

    @Override // defpackage.xgn
    public final void y(MessageLite messageLite, aigj aigjVar, amdd amddVar) {
        this.b.y(messageLite, aigjVar, amddVar);
    }

    @Override // defpackage.xgn
    public final void z(Consumer consumer) {
        this.b.z(consumer);
    }
}
