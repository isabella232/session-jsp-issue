# Demo of Jetty 9.4.21 problem with Sessions

## To Build

```
$ mvn clean install
```

That will build the war and put into the `/webapps/` folder on the ROOT context path.

## To Run Server

```
$ java -jar ~/code/jetty/distros/jetty-home-9.4.21.v20190926/start.jar 
2019-10-04 10:43:18.559:INFO::main: Logging initialized @413ms to org.eclipse.jetty.util.log.StdErrLog
2019-10-04 10:43:18.760:INFO:oejs.Server:main: jetty-9.4.21.v20190926; built: 2019-09-26T16:41:09.154Z; git: 72970db61a2904371e1218a95a3bef5d79788c33; jvm 11.0.4+11
2019-10-04 10:43:18.772:INFO:oejdp.ScanningAppProvider:main: Deployment monitor [file:///home/joakim/code/jetty/github/session-jsp-webapp/webapps/] at interval 1
2019-10-04 10:43:18.910:INFO:oeja.AnnotationConfiguration:main: Scanning elapsed time=26ms
2019-10-04 10:43:18.950:INFO:oejs.session:main: DefaultSessionIdManager workerName=node0
2019-10-04 10:43:18.950:INFO:oejs.session:main: No SessionScavenger set, using defaults
2019-10-04 10:43:18.951:INFO:oejs.session:main: node0 Scavenging every 600000ms
2019-10-04 10:43:18.969:INFO:oejsh.ContextHandler:main: Started o.e.j.w.WebAppContext@5386659f{Session JSP WebApp,/,file:///tmp/jetty-0_0_0_0-8080-ROOT_war-_-any-7141786116707265026.dir/webapp/,AVAILABLE}{/home/joakim/code/jetty/github/session-jsp-webapp/webapps/ROOT.war}
2019-10-04 10:43:18.984:INFO:oejs.AbstractConnector:main: Started ServerConnector@616abfab{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
2019-10-04 10:43:18.984:INFO:oejs.Server:main: Started @839ms
2019-10-04 10:43:25.243:WARN:oejs.session:qtp1625082366-47: 
```

You now have the server running on [http://localhost:8080/index.jsp](http://localhost:8080/index.jsp)


