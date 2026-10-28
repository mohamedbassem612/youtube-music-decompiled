package defpackage;

import com.google.protobuf.MessageLite;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public interface xgn extends xhy, xhz {
    public static final xgn l = new xgy();

    void B();

    @Deprecated
    void C(xgt xgtVar);

    xgt D(xhc xhcVar, xgu xguVar, ajwo ajwoVar);

    xgt a();

    xgt b(xhc xhcVar, ajwo ajwoVar, amdd amddVar);

    xgt c(xhc xhcVar, xgu xguVar, ajwo ajwoVar, amdd amddVar, amdd amddVar2);

    argn g(Object obj, xhc xhcVar);

    argn h(Object obj, xhc xhcVar, int i);

    void j(Object obj, xhc xhcVar, int i);

    void k(List list);

    void l(xgz xgzVar);

    void m(xgz xgzVar, xgz xgzVar2);

    void n(List list);

    void u();

    void v();

    void y(MessageLite messageLite, aigj aigjVar, amdd amddVar);

    void z(Consumer consumer);
}
