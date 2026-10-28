package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import org.apache.http.ConnectionClosedException;
import org.apache.http.HttpException;
import org.apache.http.impl.DefaultHttpServerConnection;
import org.apache.http.protocol.BasicHttpContext;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abtc implements Runnable {
    final /* synthetic */ abtd a;
    private final Socket b;

    public abtc(abtd abtdVar, Socket socket) {
        this.a = abtdVar;
        this.b = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DefaultHttpServerConnection defaultHttpServerConnection = new DefaultHttpServerConnection();
        try {
            try {
                Socket socket = this.b;
                abtd abtdVar = this.a;
                defaultHttpServerConnection.bind(socket, abtdVar.b);
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                while (!Thread.interrupted() && defaultHttpServerConnection.isOpen()) {
                    abtdVar.c.handleRequest(defaultHttpServerConnection, basicHttpContext);
                }
            } catch (ConnectionClosedException unused) {
            } catch (IOException e) {
                String message = e.getMessage();
                if (message == null || !(e instanceof SocketException) || (!message.contains("Connection reset by peer") && !message.contains("Socket closed"))) {
                    ((agrc) ((agrc) ((agrc) abtd.a.b()).j(e)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$RequestHandler", "run", 272, "MediaServer.java")).t("IOException when handling a request");
                }
            } catch (HttpException e2) {
                ((agrc) ((agrc) ((agrc) abtd.a.b()).j(e2)).k("com/google/android/libraries/youtube/player/proxy/MediaServer$RequestHandler", "run", 275, "MediaServer.java")).t("HTTP protocol violation");
            }
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused2) {
            }
        } catch (Throwable th) {
            try {
                defaultHttpServerConnection.shutdown();
            } catch (IOException unused3) {
            }
            throw th;
        }
    }
}
