from django.shortcuts import render
from .models import Student
from .serializers import StudentSerializer
from django.http import JsonResponse
from django.http import HttpResponse
# Create your views here.


def students_json(request):
    students = Student.objects.all()
    serializer = StudentSerializer(students, many=True) # many=True -> serializer ocekuje da ce biti vise objekata
    return JsonResponse(serializer.data, safe=False, status=201)

def student_json(request, id):
    student = Student.objects.get(id=id)
    serializer = StudentSerializer(student)
    return JsonResponse(serializer.data, safe=False, status=201)

def students_html(request, id):
    ret = "<html><body><p>"

    student = Student.objects.get(id=id)

    ret += "Name: "
    ret += student.name
    ret += "</p></body></html>"

    return HttpResponse(ret, status=200)