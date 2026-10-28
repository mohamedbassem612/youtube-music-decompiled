package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class jvb implements jum {
    private final jum a;
    private final jum b;
    private volatile jum c;
    private volatile jum d = null;
    private boolean e;

    public jvb(jum jumVar, jum jumVar2) {
        this.a = jumVar;
        this.b = jumVar2;
        this.c = jumVar;
    }

    @Override // defpackage.clk
    public final int a() {
        return this.c.a();
    }

    @Override // defpackage.clk
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        return this.c.b(bufferInfo);
    }

    @Override // defpackage.clk
    public final MediaFormat c() {
        return this.c.c();
    }

    @Override // defpackage.jum
    public final ctd d() {
        return this.c.d();
    }

    @Override // defpackage.clk
    public final ByteBuffer e(int i) {
        return this.c.e(i);
    }

    @Override // defpackage.clk
    public final ByteBuffer f(int i) {
        return this.c.f(i);
    }

    @Override // defpackage.clk
    public final void g() {
        this.c.g();
        jum jumVar = this.d;
    }

    @Override // defpackage.clk
    public final void h() {
        this.c.h();
    }

    @Override // defpackage.clk
    public final void i() {
        this.e = true;
        this.a.i();
        this.b.i();
    }

    @Override // defpackage.clk
    public final void j(int i, long j) {
        this.c.j(i, j);
    }

    @Override // defpackage.clk
    public final void k(int i, boolean z) {
        this.c.k(i, z);
    }

    @Override // defpackage.clk
    public final void l(Surface surface) {
        this.c.l(surface);
        jum jumVar = this.d;
    }

    @Override // defpackage.clk
    public final void m(Bundle bundle) {
        this.c.m(bundle);
    }

    @Override // defpackage.clk
    public final void n(int i) {
        this.c.n(i);
    }

    @Override // defpackage.clk
    public final void o(List list) {
        this.c.o(list);
    }

    @Override // defpackage.clk
    public final void p(List list) {
        this.c.p(list);
    }

    @Override // defpackage.clk
    public final /* synthetic */ void q(bwm bwmVar) {
        bwmVar.a();
    }

    @Override // defpackage.clk
    public final boolean r() {
        return this.c.r();
    }

    @Override // defpackage.clk
    public final boolean s(clj cljVar) {
        return this.c.s(cljVar);
    }

    @Override // defpackage.clk
    public final void t(int i, int i2, long j, int i3) {
        this.c.t(i, i2, j, i3);
    }

    @Override // defpackage.clk
    public final void u(int i, cak cakVar, long j, int i2) {
        this.c.u(i, cakVar, j, i2);
    }

    @Override // defpackage.jum
    public final void v() {
        this.c.v();
        jum jumVar = this.d;
    }

    @Override // defpackage.jum
    public final void w() {
        this.c.w();
    }

    @Override // defpackage.jum
    public final boolean x() {
        return this.e;
    }
}
