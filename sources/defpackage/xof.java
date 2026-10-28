package defpackage;

import java.io.IOException;
import java.net.MulticastSocket;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class xof {
    private static final agrf a = agrf.h("com/google/android/libraries/youtube/mdx/discovery/SocketFactory$DefaultSocketFactory");

    public final MulticastSocket a(tgt tgtVar, Integer num) {
        try {
            MulticastSocket multicastSocket = new MulticastSocket();
            multicastSocket.setNetworkInterface(tgtVar.c());
            if (num != null) {
                num.intValue();
                multicastSocket.setReceiveBufferSize(262144);
            }
            multicastSocket.setBroadcast(true);
            return multicastSocket;
        } catch (IOException e) {
            ((agrc) ((agrc) ((agrc) a.b().i(agso.a, "MDX.SocketFactory")).j(e)).k("com/google/android/libraries/youtube/mdx/discovery/SocketFactory$DefaultSocketFactory", "createMulticastSocketInternal", '=', "SocketFactory.java")).w("Error creating socket on interface %s", tgtVar.a());
            return null;
        }
    }
}
