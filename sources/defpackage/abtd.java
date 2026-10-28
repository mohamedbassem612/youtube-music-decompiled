package defpackage;

import app.rive.semantics.SemanticState;
import java.net.ServerSocket;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.http.impl.DefaultHttpResponseFactory;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpRequestHandler;
import org.apache.http.protocol.HttpRequestHandlerRegistry;
import org.apache.http.protocol.HttpService;
import org.apache.http.protocol.ResponseContent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abtd {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/proxy/MediaServer");
    public final HttpParams b = new BasicHttpParams().setBooleanParameter("http.connection.stalecheck", false).setBooleanParameter("http.tcp.nodelay", true).setIntParameter("http.socket.buffer-size", SemanticState.Multiline);
    public final HttpService c;
    public final abti d;
    public ServerSocket e;
    public ExecutorService f;
    private final HttpRequestHandlerRegistry g;

    public abtd(Map map) {
        abti abtiVarB = b();
        this.d = abtiVarB;
        BasicHttpProcessor basicHttpProcessor = new BasicHttpProcessor();
        basicHttpProcessor.addInterceptor(abtiVarB);
        basicHttpProcessor.addInterceptor(new ResponseContent());
        basicHttpProcessor.addInterceptor(new absw());
        this.g = new HttpRequestHandlerRegistry();
        agqr it = ((agpk) ((agpn) map).entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.g.register((String) entry.getKey(), (HttpRequestHandler) entry.getValue());
        }
        HttpService httpService = new HttpService(basicHttpProcessor, new NoConnectionReuseStrategy(), new DefaultHttpResponseFactory());
        this.c = httpService;
        httpService.setHandlerResolver(this.g);
        httpService.setParams(this.b);
    }

    private static abti b() {
        try {
            return new abti();
        } catch (NoSuchAlgorithmException e) {
            ((agrc) ((agrc) ((agrc) a.c()).j(e)).k("com/google/android/libraries/youtube/player/proxy/MediaServer", "instantiateInterceptor", 'H', "MediaServer.java")).t("NoSuchAlgorithmException starting MediaServer");
            return new abti();
        }
    }

    public final abtb a(String str, String str2, int i, String str3, long j, long j2) {
        abtb abtbVar = new abtb(this, str);
        abtbVar.b("v", str2);
        abtbVar.c("i", i);
        abtbVar.b("x", str3);
        abtbVar.d("l", j);
        abtbVar.d("m", j2);
        abtbVar.c("f", 0);
        return abtbVar;
    }
}
