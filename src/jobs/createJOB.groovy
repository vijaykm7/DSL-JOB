job('DSL_code_job') {
scm {
github('jenkinsci/job-dsl-plugin', 'master')
}
triggers {
cron("@minute")
}
steps {
shell("echo 'Hello World'")
}
}